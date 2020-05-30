//students Lia Barbu & Teodor Barbu
package project;

import java.sql.*;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

public class Project14 extends Application {

	private PreparedStatement preparedStatement;
	private Connection connection;
	private Label courses;
	private String url = "jdbc:sqlserver://s16988308.onlinehome-server.com:1433;databaseName=CUNY_DB;integratedSecurity=false;";
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private TextField tfLogin = new TextField();
	private PasswordField pfPassword = new PasswordField();
	@SuppressWarnings("rawtypes")
	private TableView table = new TableView();
	@SuppressWarnings("rawtypes")
	private ObservableList<ObservableList> data = FXCollections
			.observableArrayList();

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Label login = new Label("Login ID:");
		grid.add(login, 0, 0);

		grid.add(tfLogin, 1, 0);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		grid.add(pfPassword, 1, 2);
		Button btn = new Button("Login");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);

		BorderPane borderPaneTable = new BorderPane();
		courses = new Label("Courses:");
		borderPaneTable.setTop(courses);
		borderPaneTable.setCenter(table);
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(grid);
		borderPane.setBottom(borderPaneTable);

		Scene scene = new Scene(borderPane, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

		btn.setOnAction(e -> {
			connectToDB();
			showResults();
		});
	}

	private void connectToDB() {

		String username = tfLogin.getText().trim();
		String password = pfPassword.getText().trim();

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			String queryString = "select Course.courseID, title, numOfCredits from Course, Enrollment, Students"
					+ " where Course.courseID = Enrollment.courseId"
					+ " and Students.ssn  = Enrollment.ssn and Students.ssn = '919191919'";

			preparedStatement = connection.prepareStatement(queryString);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void showResults() {
		if (connection == null) {
			courses.setText("Invalid login ID or password.");
			return;
		} else {

			try {

				ResultSet rset = preparedStatement.executeQuery();

				for (int i = 0; i < rset.getMetaData().getColumnCount(); i++) {

					final int j = i;
					TableColumn col = new TableColumn(rset.getMetaData()
							.getColumnName(i + 1));
					col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
						public ObservableValue<String> call(
								CellDataFeatures<ObservableList, String> param) {
							return new SimpleStringProperty(param.getValue()
									.get(j).toString());
						}
					});

					table.getColumns().addAll(col);

				}
				while (rset.next()) {
					ObservableList<String> row = FXCollections
							.observableArrayList();
					for (int i = 1; i <= rset.getMetaData().getColumnCount(); i++) {

						row.add(rset.getString(i));
					}

					data.add(row);

				}

				table.setItems(data);

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch(args);
	}
}

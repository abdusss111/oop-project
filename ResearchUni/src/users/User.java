package users;

import java.io.Serializable;

public abstract class User implements Serializable {
    private int id; // Добавлен тип данных.
    private String name;
    private String username;
    private String password;
    public User() {
        this.id = 0;
        
    }
    
    public User(String name, int id) {
    	this.name = name;
    	this.id = id;
    }
    
    

    /**
     * Parameterized constructor to initialize the user.
     *
     * @param id       Unique identifier.
     * @param username Username of the user.
     * @param password Password of the user.
     */
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * Simulates user login.
     *
     * @return A message indicating the user has logged in.
     */
    public String login() {
        return "User " + username + " logged in.";
    }

    /**
     * Simulates user logout.
     *
     * @return A message indicating the user has logged out.
     */
    public String logout() {
        return "User " + username + " logged out.";
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' + '}';
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

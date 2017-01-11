package ideanoval.service;

public interface UserInterface {
	public boolean createUser (String login, String pwdUser);
	public boolean deleteUser (String loggin);
	public boolean desactiveUser (String loggin);
}

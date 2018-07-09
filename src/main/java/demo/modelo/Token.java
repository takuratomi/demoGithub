package demo.modelo;

public class Token {
	
	String token;
	String key;
	String ip;
	
	/**
	 * 
	 */
	public Token() {
		super();
		this.token = "";
		this.key = "";
		this.ip = "";
	}
	
	/**
	 * Creacion del obejto token con parametros de entrada
	 * @param token
	 * @param key
	 * @param ip
	 */
	public Token(String token, String key, String ip) {
		super();
		this.token = token;
		this.key = key;
		this.ip = ip;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
}

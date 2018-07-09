package demo.utility;

import java.util.Date;

import org.springframework.cglib.core.Signature;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.impl.JWTParser;
import com.auth0.jwt.impl.NullClaim;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import demo.modelo.Token;

public class Util {

	/**
	 * Creacion del token haciendo uso de los parametros de entrada
	 * 
	 * @param usuario
	 * @param ip
	 * @param key
	 * @param date
	 * @return
	 */
	public String createToken(String usuario, String ip, String key, Date date) {
		String jwt = "";

		Algorithm algorithm = Algorithm.HMAC256("secret");

		try {
			jwt = JWT.create().withSubject("users/TzMUocMF4p")
					.withExpiresAt(new Date(1300819380))
					.withClaim("name", "Robert Token Man")
					.withClaim("scope", "self groups/admins")
					.sign(algorithm)
					.toString();
		} catch (JWTCreationException ejwt) {
			jwt = ejwt.getMessage();
		} catch (Exception e) {
			jwt = e.getMessage();
		}

		return jwt;
	}

	/**
	 * Validacion del Token
	 * 
	 * @param token
	 * @param ip
	 * @param key
	 * 			@return{
	 * 
	 * 
	 *            }
	 */
	public String validateToken(Token token, String ip, String key) {
		return null;
	}

	/**
	 * Obtener el user del token
	 * 
	 * @param token
	 * @param key
	 * @return
	 */
	public String getUserByToken(Token token, String key) {

		return null;
	}

	/**
	 * Obtener una propieda que contenga el token
	 * 
	 * @param token
	 * @param key
	 * @param atributte
	 * @return
	 */
	public String getAtributte(Token token, String key, String atributte) {
		return null;
	}

}

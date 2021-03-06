package java.com.esign;

/*
 * Project: Alfresco Esign Module , part of the Creative Summer
 * License   : GNU General Public License, version 2 (http://www.gnu.org/licenses/gpl-2.0.html)
 */

/**
 * A Signer object represents a person to sign and verify the content. Classes
 * implementing this interface should have a reference of this person's
 * Certificate and PrivateKey.
 * 
 * @param <T>
 *            the type of data.
 * 
 * @see SignContent
 */
public interface Signer<T extends SignContent<?>> {

	@SuppressWarnings("unchecked")
	public T[] sign(T... data) throws Exception;

	@SuppressWarnings("unchecked")
	public boolean[] verify(T... data);
	
}

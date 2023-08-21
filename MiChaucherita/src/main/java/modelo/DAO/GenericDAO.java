/**
 * 
 */
package modelo.DAO;

import java.util.List;

/**
 * 
 */
public interface GenericDAO <T, ID> {

	public T getById(ID id);
	public List<T> getAll(); //donde t puede presentar cuenta,persona ect
	public void create(T entity);
	public void delete(T entity);
	public void deleteById(ID id);
	public void update(T entity);

}

package org.com.sys.liuxu.dao.base;


import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class BaseDaoSql extends SqlSessionDaoSupport {

	public <T> T findOne(String statement) {
		return this.getSqlSession().<T> selectOne(statement);
	}

	public <T> T findOne(String statement, Object parameter) {
		return this.getSqlSession().<T> selectOne(statement, parameter);
	}

	public boolean exists(String statement, Object parameter) {
		return true;
	}

	public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
		return this.getSqlSession().<K, V> selectMap(statement, mapKey);
	}

	public <K, V> Map<K, V> selectMap(String statement, Object parameter,
			String mapKey) {
		return this.getSqlSession().<K, V> selectMap(statement, parameter, mapKey);
	}

	public <K, V> Map<K, V> selectMap(String statement, Object parameter,
			String mapKey, int start, int length) {
		
		RowBounds rowBounds = new RowBounds((start-1)*length, length);
		return this.getSqlSession().<K, V> selectMap(statement, parameter, mapKey,rowBounds);
	}

	/**
	 * 
	 * @param statement
	 * @param paramsMap
	 * @return
	 */
	public <E> List<E> findList(String statement, Map<String, Object> paramsMap) {
		return this.getSqlSession().selectList(statement, paramsMap);
	}

	public <E> List<E> findList(String statement,
			Map<String, Object> paramsMap, int start, int length) {
		RowBounds rowBounds = new RowBounds((start-1)*length, length);
		return this.getSqlSession().<E> selectList(statement, paramsMap, rowBounds);
	}

	public <E> List<E> findList(String statement) {
		return this.getSqlSession().<E> selectList(statement);
	}

	public <E> List<E> findList(String statement, Object parameter) {
		return this.getSqlSession().<E> selectList(statement, parameter);
	}

	public <E> List<E> findList(String statement, Object parameter, int start,
			int length) {
		RowBounds rowBounds = new RowBounds((start-1)*length, length);
		return this.getSqlSession().<E> selectList(statement, parameter, rowBounds);
	}

	public int create(String statement) {
		return this.getSqlSession().insert(statement);
	}

	public int create(String statement, Object parameter) {
		return this.getSqlSession().insert(statement, parameter);
	}

	public int update(String statement) {
		return this.getSqlSession().update(statement);
	}

	public int update(String statement, Object parameter) {
		return this.getSqlSession().update(statement, parameter);
	}

	public int delete(String statement) {
		return this.getSqlSession().delete(statement);
	}

	public int delete(String statement, Object parameter) {
		return this.getSqlSession().delete(statement, parameter);
	}
}
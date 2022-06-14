package tutorial.classes;

public interface Dao<T> {
	void create(T arg);
	void read(int id);
	void update(T arg);
	int delete(int id);
}

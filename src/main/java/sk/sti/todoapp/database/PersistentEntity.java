package sk.sti.todoapp.database;

public abstract class PersistentEntity implements Persistent {

	@Override
	public int hashCode() {
		int result = 1;
		if (getId() > 0) {
			final int prime = 31;
			result = prime * result + (int) (getId() ^ (getId() >>> 32));
		} else {
			result = super.hashCode();
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PersistentEntity)) {
			return false;
		}
		PersistentEntity other = (PersistentEntity) obj;

		if (!getRealClass().equals(((PersistentEntity) obj).getRealClass())) {
			return false;
		}

		if (getId() == -1 && other.getId() == -1) {
			return super.equals(obj);
		}

		if (getId() != other.getId()) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isPersisted() {
		return getId() > 0;
	}
}

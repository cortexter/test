package sk.sti.todoapp.database;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public abstract class BasicEntity extends PersistentEntity implements IEntityChange {

	protected BasicEntity() {
	}

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateInsert;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateUpdate;

	@Override
	public Date getDateInsert() {
		return dateInsert;
	}

	@Override
	public Date getDateUpdate() {
		return dateUpdate;
	}

}
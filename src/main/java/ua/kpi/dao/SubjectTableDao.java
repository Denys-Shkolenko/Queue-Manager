package ua.kpi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.kpi.models.SubjectTable;
import ua.kpi.utils.HibernateSessionFactoryUtil;

import java.util.List;
import java.util.Optional;

public class SubjectTableDao implements Dao<SubjectTable> {

    private final SessionFactory sessionFactory;

    public SubjectTableDao() {
        this.sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();
    }

    @Override
    public Optional<SubjectTable> get(int id) {
        Session session = sessionFactory.openSession();
        Optional<SubjectTable> subjectTable = Optional.of(session.get(SubjectTable.class, id));
        session.close();
        return subjectTable;
    }

    @Override
    public void save(SubjectTable subjectTable) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.persist(subjectTable);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(SubjectTable subjectTable) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.merge(subjectTable);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(SubjectTable subjectTable) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.remove(subjectTable);
        tx1.commit();
        session.close();
    }

    @Override
    public List<SubjectTable> getAll() {
        Session session = sessionFactory.openSession();
        List<SubjectTable> subjectTables = session
                .createNativeQuery("SELECT * FROM subject_tables", SubjectTable.class)
                .getResultList();
        session.close();
        return subjectTables;
    }
}

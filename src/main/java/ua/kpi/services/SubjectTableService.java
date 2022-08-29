package ua.kpi.services;

import jakarta.persistence.EntityNotFoundException;
import ua.kpi.dao.SubjectTableDao;
import ua.kpi.models.SubjectTable;

import java.util.List;

public class SubjectTableService {

    private final SubjectTableDao subjectTableDao;

    public SubjectTableService() {
        this.subjectTableDao = new SubjectTableDao();
    }

    public SubjectTable getSubjectTable(int id) {
        return subjectTableDao.get(id).orElseThrow(
                () -> new EntityNotFoundException("SubjectTable by id %d does not exist".formatted(id)));
    }

    public void saveSubjectTable(SubjectTable subjectTable) {
        subjectTableDao.save(subjectTable);
    }

    public void updateSubjectTable(SubjectTable subjectTable) {
        subjectTableDao.update(subjectTable);
    }

    public void deleteSubjectTable(SubjectTable subjectTable) {
        subjectTableDao.delete(subjectTable);
    }

    public List<SubjectTable> getAllSubjectTables() {
        return subjectTableDao.getAll();
    }
}

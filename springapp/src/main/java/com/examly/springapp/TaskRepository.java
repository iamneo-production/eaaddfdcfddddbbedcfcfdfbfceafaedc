public interface TaskRepository extends JpaRepository<Task, String> {
    List<Task> findByTaskHolderName(String taskHolderName);
}

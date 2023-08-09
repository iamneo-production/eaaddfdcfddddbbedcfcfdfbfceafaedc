@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/saveTask")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @GetMapping("/changeStatus")
    public Task changeStatus(@RequestParam String id, @RequestParam String newStatus) {
        return taskService.changeTaskStatus(id, newStatus);
    }

    @GetMapping("/deleteTask")
    public void deleteTask(@RequestParam String id) {
        taskService.deleteTask(id);
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/getTask")
    public List<Task> getTaskByTaskHolderName(@RequestParam String taskHolderName) {
        return taskService.getTasksByTaskHolderName(taskHolderName);
    }
}

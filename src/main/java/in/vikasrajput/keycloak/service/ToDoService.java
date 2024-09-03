package in.vikasrajput.keycloak.service;

import in.vikasrajput.keycloak.dto.ToDo;
import in.vikasrajput.keycloak.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    // Create a new ToDo
    public ToDo saveToDo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    // Retrieve all ToDos
    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    // Retrieve a single ToDo by ID
    public Optional<ToDo> getToDoById(Long id) {
        return toDoRepository.findById(id);
    }

    // Update an existing ToDo
    public ToDo updateToDo(Long id, ToDo toDoDetails) {
        Optional<ToDo> optionalToDo = toDoRepository.findById(id);
        if (optionalToDo.isPresent()) {
            ToDo toDo = optionalToDo.get();
            toDo.setTitle(toDoDetails.getTitle());
            toDo.setDescription(toDoDetails.getDescription());
            toDo.setCompleted(toDoDetails.isCompleted());
            return toDoRepository.save(toDo);
        } else {
            throw new RuntimeException("ToDo not found with id " + id);
        }
    }

    // Delete a ToDo by ID
    public void deleteToDoById(Long id) {
        toDoRepository.deleteById(id);
    }
}

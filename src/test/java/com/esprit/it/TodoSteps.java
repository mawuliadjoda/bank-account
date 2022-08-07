package com.esprit.it;

import com.esprit.model.Todo;
import com.esprit.service.TodoService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoSteps {

    @Autowired
    private TodoService todoService;

    @Given("ma liste de todos est vide")
    public void initActions() {
    }

    @When("^j'insére un todo avec la description (.*)$")
    public void insertAction(String description) {
        todoService.addTodo(description);
    }

    @Then("^ma liste contient un todo avec la description (.*)$")
    public void checkAction(String description) {
        List<Todo> todos = todoService.getTodos();
        assertEquals(1, todos.size());
        assertEquals(description, todos.get(0).getDescription());
    }
}

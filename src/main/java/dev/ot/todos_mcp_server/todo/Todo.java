package dev.ot.todos_mcp_server.todo;

import java.time.LocalDate;

public record Todo(long id, String title, String notes, Priority priority, LocalDate dueDate, boolean done, String source) {
}

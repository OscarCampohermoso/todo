package bo.edu.ucb.todo.dto;

import java.util.*;

public class TaskDto {
    private String taskId;
    private String description;
    private Date date;
    private boolean isDone;
    private LabelDto label;

    public TaskDto() {
    }

    public TaskDto(String taskId, String description, Date date, boolean isDone, LabelDto label) {
        this.taskId = taskId;
        this.description = description;
        this.date = date;
        this.isDone = isDone;
        this.label = label;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public LabelDto getLabel() {
        return this.label;
    }

    public void setLabel(LabelDto label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "{" +
                " taskId='" + getTaskId() + "'" +
                ", description='" + getDescription() + "'" +
                ", date='" + getDate() + "'" +
                ", isDone='" + getIsDone() + "'" +
                ", label='" + getLabel() + "'" +
                "}";
    }
}

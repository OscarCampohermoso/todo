package bo.edu.ucb.todo.dto;

public  class LabelDto {
    private String labelId;
    private String name;

    public LabelDto() {
    }

    public LabelDto(String labelId, String name) {
        this.labelId = labelId;
        this.name = name;
    }

    public String getLabelId() {
        return this.labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
            " labelId='" + getLabelId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

}

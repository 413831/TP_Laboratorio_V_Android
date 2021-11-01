package utn.sistema.tp_laboratorio_v.objects;

import java.util.Objects;

/**
 * Item de la lista de gastos
 * Producto o servicio
 */
public class Item
{
    private Integer id;
    private String description;
    private Double prize;
    private Category category;

    public Item(Integer id, String description, Double prize, Category category)
    {
        this.id = id;
        this.description = description;
        this.prize = prize;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", prize=").append(prize);
        sb.append(", category=").append(category);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(getId(), item.getId()) && Objects.equals(getDescription(),
                item.getDescription()) && Objects.equals(getPrize(),
                item.getPrize()) && Objects.equals(getCategory(), item.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getPrize(), getCategory());
    }
}

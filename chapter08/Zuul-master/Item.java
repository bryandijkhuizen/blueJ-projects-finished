import java.util.HashMap;
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    private HashMap<String, Item> items;
    private String itemDescription;
    private String name;
    private int weight;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String itemDescription, int weight)
    {
        this.name = name;
        this.itemDescription = itemDescription;
        this.weight = weight;
        items = new HashMap<String, Item>();
    }
    /** 
     * voegt items toe aan de hashmap items
     */
    private void addItems()
    {
        items.put("golden_key", new Item("golden_key", "a_golden_key_is_the_key_for_the_golden_door", 1));
        items.put("silver_key", new Item("silver_key", "a_silver_key_is_the_key_for_the_silver_door", 1));
        items.put("bronze_key",new Item("bronze_key", "a_bronze_key_is_the_key_for_the_bronze_door", 1));
        items.put("machete",new Item("machete", "a_melee_weapon", 5));
        items.put("golden_apple", new Item("golden_apple", "a_golden_apple_is_an_apple_for_health_regen", 2));
        items.put("backpack", new Item("backpack", "a_backpack_increases_your_inventory_capacity", 2));
    }
    public String getItemDescription()
    {
        return itemDescription;
    }
}

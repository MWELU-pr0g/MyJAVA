using System;

using System.Collections.Generic;

using System.Linq;

using System.Text;

namespace check1 {

 class Check1
{
    //loads the list of products  
    private static string dataPath = "data.json";

    public static List<Product> LoadProducts()
    {
        List<Product> listOfProducts = new List<Product>();

        if (File.Exists(dataPath))
        {
            string json = File.ReadAllText("data.json");
            if (!string.IsNullOrWhiteSpace(json))
            {
                listOfProducts = JsonConvert.DeserializeObject<List<Product>>(json);
            }
        };           

        return listOfProducts;
    }        

    public static void SaveProducts(List<Product> productsToSave)
    {
        if (!File.Exists(dataPath))
            File.Create(dataPath);

        string json = JsonConvert.SerializeObject(productsToSave);

        File.WriteAllText(dataPath, json);
    }









    public static List<Product> products;
    public static List<Product> Products
    {
        get
        {
            if (products.Count == 0)
            {
                Load();
            }

            return products;
        }
        set { products = value; }
    }

    static Inventory()
    {
        Products = new List<Product>();
    }

    private static void Load()
    {
        Products = DataManager.LoadProducts();
    }

    private static void Save()
    {
        DataManager.SaveProducts(Products);
    }

    public static void RemoveProduct(int productId)
    {
        Inventory.Products.RemoveAll(x => x.Id == productId);
        Save();
    }

    public static void Add(Product product)
    {
        Products.Add(product);
        Save();
    }

    public static int GetNewId()
    {
        int id;
        if (Inventory.Products.Count == 0)
            id = 1;
        else
        {
            id = Inventory.Products.Last().Id + 1;
        }

        return id;
    }

    public static int GetProductCount()
    {
        return Inventory.Products.Count();
    }

    public static int GetUnitCount()
    {
        return Inventory.Products.Select(x => x.Quantity).Sum();
    }

    public static decimal GetInventoryValue()
    {
        return Inventory.Products.Select(x => (x.Price * x.Quantity)).Sum();
    }
    public static void ClearInventory()
    {
        Inventory.Products.Clear();
        Save();
    }

    public static int GetNewId()
{
    return Products.Count == 0 ? 1 : Products[products.Count - 1].Id + 1;
}

public static int GetProductCount()
{
    return Products.Count;
}

public static int GetUnitCount()
{
    return Products.Select(x => x.Quantity).Sum();
}

public static decimal GetInventoryValue()
{
    return Products.Select(x => (x.Price * x.Quantity)).Sum();
}
private static void Save()
{
    DataManager.SaveProducts(Products);
}

public static void RemoveProduct(int productId)
{
    Inventory.Products.RemoveAll(x => x.Id == productId);
    Save();
}

public static void Add(Product product)
{
    Products.Add(product);
    Save();
}

    private static string dataPath = "data.json";

    public static List<Product> LoadProducts()
    {
        List<Product> listOfProducts = new List<Product>();

        if (File.Exists(dataPath))
        {
            string json = File.ReadAllText("data.json");
            if (!string.IsNullOrWhiteSpace(json))
            {
                listOfProducts = JsonConvert.DeserializeObject<List<Product>>(json);
            }
        };           

        return listOfProducts;
    }        

    public static void SaveProducts(List<Product> productsToSave)
    {
        if (!File.Exists(dataPath))
            File.Create(dataPath);

        string json = JsonConvert.SerializeObject(productsToSave);

        File.WriteAllText(dataPath, json);
    }

}
This is a C# software program that's supposed to manage the stock level of vet drugs product 


This is the features I implemented in this application:

Possibilty of adding drug products.
Local storage of the data as JSON objects.
List of all five vet drug products.
Possibilty of remove an specific product(when purchased is done).
Get the value of the inventory (sum of price of all items).
Get the count of products in the inventory.
Get the unit count (sum of quantity of all items).


Product - The five types of vet drugs to be manage.

Inventory - This is a static class that holds a list of products and has several methods:

Load() - Private method that loads the data from the local file to the Inventory.Products list of products.
Save() - Private method that saves the products list to the disk (in JSON format).
RemoveProduct() - Remove an specific product accoding to its id.
Add() - Add a new product to the inventory.
GetNewId() - Gets an available id accoding to the items in the list.
GetProductCount() - Get the count of products in the inventory.
GetUnitCount() - Gets the sum of the quantity of all items.
GetInventoryValue() - Sum of the price of all items.
ClearInventory() - Removes all the items from the inventory.
DataManager - Private static class that handles save and recover data from the disk. It has two methods:

LoadProducts() - Load data the of the products.
SaveProducts() - Save products.
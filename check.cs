using System;

using System.Collections.Generic;

using System.Linq;

using System.Text;
using 

namespace check1 {

  class Program {
       int Id ;
    string Name ;
    int Quantity;
   public  List<Product> products;
    static void Main(string[] args) {
    


     
    
    }
        public  List<Product> Products
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
  }
}
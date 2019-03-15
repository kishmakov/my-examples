using System;
using AppKit;

namespace myvsdesktop
{
    static class MainClass
    {
        static int g(int n)
        {
            if (n < 0)
            {
                throw new Exception("What do you want?");
            }

            if (n == 0)
            {
                return 10;
            } 
            else
            {
                return g(n - 1) + f(n - 2);
            }

        }

        static int f(int n)
        {
            return g(n - 1) + f(n - 2);
        }

        static void Main(string[] args)
        {
            f(10); // throwing function
            NSApplication.Init();
            NSApplication.Main(args);
        }
    }
}


# Custom Gson Adapter

If you have a necessity of use a interface as a object and use Gson library to manage your JSON Objects, then, you will get this exception:



```bash
  Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type.
```

Then, a created this sample to show how to create a custom TypeAdapter
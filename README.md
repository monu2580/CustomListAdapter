# Use Custom ListAdapter
    Create a Android Project (MainActivity.java & activity_main.xml)
    in activity_main.xml
      Create one <ListView>
    Create Layout XML File(list_item.xml)
      Create view(ImageView/TextView..etc)
    


## 1 Create Custom Adapter(UserAdapter.java)
    Create Simple Class File( i.e : UserAdapter)
    extends ArrayAdaper<User> {User is a Pojo or bean} and Create Constructor with Parameter
      Create Instance Variable and initiliz within constructor
      
     inside Class
        OverRide GetView() Method
        Declare all View of list_item.xml and initilize all View in GetView() method2
        
        
## 2 Use Adapter in (MainActivity.java)
        Declare ListView, UserAdapter class & ArrayList<User> and init within OnCreate()

        Create Object of User(init with param)  
        Add all user object to  ArrayList<User>
        init adapter 
          '''adapter=new UserAdapter(this,R.layout.list_item,userArrayList)'''
         set Adapter to ListView
          '''listView.setAdapter(adapter)'''
          
          To Use OnClick
            implements OnItemClickListener with MainActivity.java
            override OnItemClick()
              in OnCreate() 'listview.setOnItemClickListener(this)'
              
             in GetView()
              User user=arryList.get(position);
              //Get All ListView Content

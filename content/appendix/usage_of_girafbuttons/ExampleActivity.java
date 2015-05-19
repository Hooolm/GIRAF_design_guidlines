public class ExampleActivity extends GirafActivity {

    ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the layout of the activity
        setContentView(R.layout.example_activity);

        // Get a button from xml
        GirafButton xmlButton = (GirafButton) findViewById(R.id.giraf_button); //* \label{line:button_java:findviewbyid}

        // Program buttons directly in code
        GirafButton textButton = new GirafButton(this, "Camera"); //* \label{line:button_java:constructorstart}
        GirafButton iconButton = new GirafButton(this, getResources().getDrawable(R.drawable.icon_camera)); 
        GirafButton iconTextButton = new GirafButton(this, getResources().getDrawable(R.drawable.icon_camera), "Camera"); //* \label{line:button_java:constructorend}

    }
}
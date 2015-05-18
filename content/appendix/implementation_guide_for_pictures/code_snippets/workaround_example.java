...

// Create a database-helper, which will allow us to find the pictogram
Helper helper = new Helper(context);

// Find the sequence that we want to display
Sequence sequence = ...

// Find the pictogram to be displayed
long pictogramId = sequence.getPictogramId();
Pictogram pictogram = helper.pictogramHelper.getById(pictogramId);

// Use this pictogram to display the sequence as a picture
GirafPictogramItemView itemView = new GirafPictogramItemView(context, pictogram);

...
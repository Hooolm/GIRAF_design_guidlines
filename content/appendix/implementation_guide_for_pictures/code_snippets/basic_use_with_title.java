@Override
public View getView(int position, View convertView, ViewGroup parent) {
    // Find the pictogram to show
    final Pictogram pictogram = pictogramList.get(position);

    // Generate some title to display below the picture (for instance be the name of the pictogram)
    String title = ...

    // Generate a view that will be used to display the pictogram
    GirafPictogramItemView itemView = new GirafPictogramItemView(context, pictogram, title);

    // ...

    return itemView;
}
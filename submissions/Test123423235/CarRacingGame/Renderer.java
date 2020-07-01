package CarRacingGame;

public class Renderer {
    //Attributes
    private IRenderObject[] Store = new IRenderObject[0];

    //Help-Methods  //Methods from Algorithm1 Stack-Exercise to expand and reduce the Array

    /**
     * Intern Method to reduce the array by deleting the position with index unload_index
     * @param existing_array, occurring Object-array
     * @param unload_index, the index of the spot to delete
     * @return reduced_array
     */
    private IRenderObject[] reduce (IRenderObject[] existing_array, int unload_index)
    {
        IRenderObject[] reduced_array = new IRenderObject[existing_array.length - 1];      //Create new array with decreased length

        int p = 0;
        for (int i=0; i < reduced_array.length; i++)                   //Copy all values to the new array
        {                                                              //p is used to skip the copy of the unloaded spot
            if ( i == unload_index)
            {
                p = i +1;
            }
            reduced_array[i] = existing_array[p];
            p++;
        }
        return reduced_array;
    }

    /**
     * Intern Method to expand the array and write down the attachment on the new extended place
     * @param existing_array, occurring Object-array
     * @param attachment, the Object to add
     * @return expanded array
     */
    private IRenderObject[] expand (IRenderObject[] existing_array, IRenderObject attachment)
    {
        IRenderObject[] expanded_array = new IRenderObject[existing_array.length + 1];      //Create new array with increased length

        for (int i=0; i < existing_array.length; i++)                   //Copy all values to the new array
        {
            expanded_array[i] = existing_array[i];
        }
        //Copy alternative
        // if (expanded_array.length >= 0) System.arraycopy(existing_array, 0, expanded_array, 0, expanded_array.length);

        expanded_array[existing_array.length] = attachment;             //Fill the extended spot with the attachment
        return expanded_array;
    }

    //Methods
    //Exception just for training reasons

    public boolean addRenderObject(IRenderObject attachment){

        try{
            if (attachment == null){
                throw new NullIRenderObjectException();
            }
        }catch (NullIRenderObjectException e){
            //e.printStackTrace();
            e.getMessage();
        }

        int stored = -1;
        for ( int i = 0; i < Store.length; i ++){
            if ( Store [ i ] == null){
                Store [i] = attachment;
                stored = i ;
                break;
            }
        }
        if ( stored <= 0 ) {
            Store = expand( Store , attachment);
            stored = Store.length;
        }

        return (Store[stored] == attachment);
    }

    //Instead of setting the array-position to null, delete the array-position -> no unnecessary nulls in the array
    public boolean removeObject (IRenderObject delete){

        try {
            if (delete == null){
                throw new NullIRenderObjectException();
            }
        } catch (NullIRenderObjectException e) {
            //e.printStackTrace();
            e.getMessage();
        }

        boolean removed = false;
        for ( int i = 0; i< Store.length; i++){
            if ( Store[i] == delete ){
                Store = reduce (Store, i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void render(){
        for (IRenderObject i : Store) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

}


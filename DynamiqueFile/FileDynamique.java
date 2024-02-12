/**
 * FileDynamique
 */
public class FileDynamique {

    private Object arrayElements[] = new Object[10] ;
    private int size = 0, size_BLOC = 5;


    public void popOrEnfiler(Object Element) {
        System.out.println("This length == " + this.arrayElements.length);
        if (this.arrayElements.length == this.size){
            this.extendsArray();
            System.out.println(" La taille du tableau apres augmentation est ==> "+ this.size);
        }
        
        this.arrayElements[++size] = Element;
        System.out.println("This size == " + this.size);

    }


    public Object pushOrDefiler() {
        Object firstElement = this.arrayElements[0];
        for (int i = 1; i < this.arrayElements.length; i++) {
            this.arrayElements[i-1] = this.arrayElements[i];
        }
        this.size--;
        return firstElement;
    }

    public int length() {
        return this.size;
    }


    public void extendsArray() {
        System.out.println("Extends array");
        Object newArrayElements []  = new Object[this.size + size_BLOC];
        for (int i = 0; i < this.size; i++) {
            newArrayElements[i] = this.arrayElements[i];
        }
        this.arrayElements = newArrayElements;
    }
    
    public boolean isEmpty()
	{
		return this.size == 0;
	}

	public String toString()
	{
		if (this.size == 0)
		{
			return "[]";
		}

		String description = "[" + this.arrayElements[0];

		for (int i = 1; i < this.size - 1; i++)
		{
			description += ", " + this.arrayElements[i];
		}

		if (this.arrayElements[0] == this.arrayElements[this.size - 1])
		{
			description += "]";
		}
		else
		{
			description += ", " + this.arrayElements[this.size - 1] + "]";
		}

		return description;
	}
}
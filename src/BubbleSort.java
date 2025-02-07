import utils.ComparableContent;
import utils.List;

public class BubbleSort<ContentType extends ComparableContent<ContentType>> {
    private List<ContentType> list;

    public BubbleSort(List<ContentType> pList) {
        this.list = pList;
    }

    public int listlength(){
        int a = 0;
        while (list.hasAccess()){
            a++;
            list.next();

        }
        return a;
    }

    public void bubbleSort() {
        list.toFirst();
        ContentType tmp;
        int stelle = 0;

        for (int i = 1; i < listlength(); i++){
            ContentType erster = list.getContent();
            list.next();
            ContentType zweiter = list.getContent();
            stelle++;
          if (erster.isGreater(zweiter)){
              tmp = erster;
              stelle--;
              list.toFirst();
              while (stelle> i){
                  if(stelle == i-1) {
                      list.setContent(zweiter);
                      list.next();
                      list.setContent(erster);
                      stelle++;
                  }
                 list.next();
                 stelle++;
              }

          }
        }
    }

    public static <ContentType> void swap(List<ContentType> list, ContentType item1, ContentType item2) {
        if (list.isEmpty() || item1.equals(item2)) {
            return; // No need to swap if the list is empty or both items are the samee
        }

        list.toFirst();
        boolean foundItem1 = false, foundItem2 = false;

        // Find both elements
        while (list.hasAccess()) {
            if (list.getContent().equals(item1)) {
                foundItem1 = true;
            } else if (list.getContent().equals(item2)) {
                foundItem2 = true;
            }
            list.next();
        }

        // If both elements are found, swap them
        if (foundItem1 && foundItem2) {
            list.toFirst();
            while (list.hasAccess()) {
                if (list.getContent().equals(item1)) {
                    list.setContent(item2);
                } else if (list.getContent().equals(item2)) {
                    list.setContent(item1);
                }
                list.next();
            }
        }
    }
}

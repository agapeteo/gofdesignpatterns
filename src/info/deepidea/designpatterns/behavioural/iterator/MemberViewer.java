package info.deepidea.designpatterns.behavioural.iterator;

public class MemberViewer {
    public static void main(String[] args) {
        Team team = new Team();
        Iterator iterator = team.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

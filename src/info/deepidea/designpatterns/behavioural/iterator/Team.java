package info.deepidea.designpatterns.behavioural.iterator;

public class Team implements Container{
    String[] members = {"Vova", "Stepa", "Pasha", "Denis"};

    @Override
    public Iterator getIterator() {
        return new MembersIterator();
    }

    private class MembersIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if (index < members.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return members[index++];
            }
            return null;
        }
    }
}
package example.iterator.pattern;

public class NameRepository implements Container {

    private String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NamedIterator();
    }

    private class NamedIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {

            if (index < names.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        @Override
        public boolean hasPrevious() {
            if (index > 0) {
                return true;
            }
            return false;
        }

        @Override
        public Object previous() {
            if (hasPrevious()) {
                return names[index--];
            }
            return null;
        }

    }

}

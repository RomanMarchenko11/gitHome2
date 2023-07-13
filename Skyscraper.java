public class Skyscraper extends Building {
    @Override
    public void Structure() {
        System.out.println("Skyscraper is a big building");
        System.out.println("Кількість поверхів будинку: " + floor);
        describe(4);
    }
    private int floor;

    public Skyscraper(int floor) {
        this.floor = floor;
    }

    public void describe(int numberOfRooms) {
        Room room = new Room();
        room.setNumberOfRooms(numberOfRooms);
        System.out.println("Кількість кімнат в типовій квартирі хмарочосу: " + room.toString());
    }
    private class Room {
        private int numberOfRooms;

        public int getNumberOfRooms() {
            return numberOfRooms;
        }

        public void setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }

        @Override
        public String toString() {
            return "Room{" +
                    "numberOfRooms=" + numberOfRooms +
                    '}';
        }
    }

}

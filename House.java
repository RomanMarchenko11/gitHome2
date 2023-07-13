public class House extends Building {
    @Override
    public void Structure() {
        System.out.println("House is a small Building");
        System.out.println("Кількість поверхів будинку: " + floor);
        describe(5);
    }
    private int floor;

    public House(int floor) {
        this.floor = floor;
    }

    public void describe(int numberOfRooms) {
        Room room = new Room();
        room.setNumberOfRooms(numberOfRooms);
        System.out.println("Кількість кімнат в типовому домі: " + room.getNumberOfRooms());
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

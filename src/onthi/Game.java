package onthi;

public class Game {
    private int id;
    private String name;
    private double price;
    private String publicBy;
    private String publicDate;
    private int status; //0. deactive, 1. active

    @Override
    public String toString() {
        return "Thông tin game: \n" +
                "Mã game: " + id +
                ", Tên game: " + name +
                ", Giá game: " + price +
                ", Nhà phát hành: " + publicBy +
                ", Ngày phát hành: " + publicDate +
                ", Trạng thái: " + newStatus();
    }

    public Game() {
    }

    public Game(int id, String name, double price, String publicBy, String publicDate, int status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publicBy = publicBy;
        this.publicDate = publicDate;
        this.status = status;
    }

    public String newStatus(){
        return (status == 1 ? "active" : "deactive");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublicBy() {
        return publicBy;
    }

    public void setPublicBy(String publicBy) {
        this.publicBy = publicBy;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

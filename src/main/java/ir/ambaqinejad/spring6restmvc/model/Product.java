package ir.ambaqinejad.spring6restmvc.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Product {
    private UUID id;
    private Integer version;
    private String beerName;
    private ProductStyle productStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    Product(UUID id, Integer version, String beerName, ProductStyle productStyle, String upc, Integer quantityOnHand, BigDecimal price, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.id = id;
        this.version = version;
        this.beerName = beerName;
        this.productStyle = productStyle;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public UUID getId() {
        return this.id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public String getBeerName() {
        return this.beerName;
    }

    public ProductStyle getProductStyle() {
        return this.productStyle;
    }

    public String getUpc() {
        return this.upc;
    }

    public Integer getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public void setProductStyle(ProductStyle productStyle) {
        this.productStyle = productStyle;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Product)) return false;
        final Product other = (Product) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$beerName = this.getBeerName();
        final Object other$beerName = other.getBeerName();
        if (this$beerName == null ? other$beerName != null : !this$beerName.equals(other$beerName)) return false;
        final Object this$productStyle = this.getProductStyle();
        final Object other$productStyle = other.getProductStyle();
        if (this$productStyle == null ? other$productStyle != null : !this$productStyle.equals(other$productStyle))
            return false;
        final Object this$upc = this.getUpc();
        final Object other$upc = other.getUpc();
        if (this$upc == null ? other$upc != null : !this$upc.equals(other$upc)) return false;
        final Object this$quantityOnHand = this.getQuantityOnHand();
        final Object other$quantityOnHand = other.getQuantityOnHand();
        if (this$quantityOnHand == null ? other$quantityOnHand != null : !this$quantityOnHand.equals(other$quantityOnHand))
            return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$createdDate = this.getCreatedDate();
        final Object other$createdDate = other.getCreatedDate();
        if (this$createdDate == null ? other$createdDate != null : !this$createdDate.equals(other$createdDate))
            return false;
        final Object this$updatedDate = this.getUpdatedDate();
        final Object other$updatedDate = other.getUpdatedDate();
        if (this$updatedDate == null ? other$updatedDate != null : !this$updatedDate.equals(other$updatedDate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Product;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $beerName = this.getBeerName();
        result = result * PRIME + ($beerName == null ? 43 : $beerName.hashCode());
        final Object $productStyle = this.getProductStyle();
        result = result * PRIME + ($productStyle == null ? 43 : $productStyle.hashCode());
        final Object $upc = this.getUpc();
        result = result * PRIME + ($upc == null ? 43 : $upc.hashCode());
        final Object $quantityOnHand = this.getQuantityOnHand();
        result = result * PRIME + ($quantityOnHand == null ? 43 : $quantityOnHand.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $createdDate = this.getCreatedDate();
        result = result * PRIME + ($createdDate == null ? 43 : $createdDate.hashCode());
        final Object $updatedDate = this.getUpdatedDate();
        result = result * PRIME + ($updatedDate == null ? 43 : $updatedDate.hashCode());
        return result;
    }

    public String toString() {
        return "Product(id=" + this.getId() + ", version=" + this.getVersion() + ", beerName=" + this.getBeerName() + ", productStyle=" + this.getProductStyle() + ", upc=" + this.getUpc() + ", quantityOnHand=" + this.getQuantityOnHand() + ", price=" + this.getPrice() + ", createdDate=" + this.getCreatedDate() + ", updatedDate=" + this.getUpdatedDate() + ")";
    }

    public static class ProductBuilder {
        private UUID id;
        private Integer version;
        private String beerName;
        private ProductStyle productStyle;
        private String upc;
        private Integer quantityOnHand;
        private BigDecimal price;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;

        ProductBuilder() {
        }

        public ProductBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public ProductBuilder version(Integer version) {
            this.version = version;
            return this;
        }

        public ProductBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public ProductBuilder productStyle(ProductStyle productStyle) {
            this.productStyle = productStyle;
            return this;
        }

        public ProductBuilder upc(String upc) {
            this.upc = upc;
            return this;
        }

        public ProductBuilder quantityOnHand(Integer quantityOnHand) {
            this.quantityOnHand = quantityOnHand;
            return this;
        }

        public ProductBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public ProductBuilder createdDate(LocalDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public ProductBuilder updatedDate(LocalDateTime updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }

        public Product build() {
            return new Product(this.id, this.version, this.beerName, this.productStyle, this.upc, this.quantityOnHand, this.price, this.createdDate, this.updatedDate);
        }

        public String toString() {
            return "Product.ProductBuilder(id=" + this.id + ", version=" + this.version + ", beerName=" + this.beerName + ", productStyle=" + this.productStyle + ", upc=" + this.upc + ", quantityOnHand=" + this.quantityOnHand + ", price=" + this.price + ", createdDate=" + this.createdDate + ", updatedDate=" + this.updatedDate + ")";
        }
    }
}

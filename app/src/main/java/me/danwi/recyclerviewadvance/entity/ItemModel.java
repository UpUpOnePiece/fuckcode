package me.danwi.recyclerviewadvance.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created with Android Studio.
 * User: HandSome-T
 * Date: 18/4/20
 * Time: 下午11:04
 */
public class ItemModel implements MultiItemEntity {
    //One Entity One Layout, Extend
    public Novel novel;
    private int itemType;

    private ItemModel(Builder builder) {
        this.novel = builder.novel;
        this.itemType = builder.itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }

    public static class Builder {
        private Novel novel;
        private int itemType;

        public Builder novel(Novel novel) {
            this.novel = novel;
            return this;
        }

        public Builder itemType(int itemType) {
            this.itemType = itemType;
            return this;
        }

        public ItemModel build() {
            return new ItemModel(this);
        }
    }
}

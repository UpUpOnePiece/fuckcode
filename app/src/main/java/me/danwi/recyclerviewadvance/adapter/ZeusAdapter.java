package me.danwi.recyclerviewadvance.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.MultipleItemRvAdapter;

import java.util.List;

import me.danwi.recyclerviewadvance.entity.ItemModel;
import me.danwi.recyclerviewadvance.viewholder.NormalOtherProvider;
import me.danwi.recyclerviewadvance.viewholder.NormalProvider;

/**
 * Created with Android Studio.
 * User: HandSome-T
 * Date: 18/4/20
 * Time: 下午11:18
 */
public class ZeusAdapter extends MultipleItemRvAdapter<ItemModel, BaseViewHolder> {

    public ZeusAdapter(@Nullable List<ItemModel> data) {
        super(data);
        finishInitialize();
    }

    @Override
    protected int getViewType(ItemModel itemModel) {
        return itemModel.getItemType();
    }

    @Override
    public void registerItemProvider() {
        mProviderDelegate.registerProvider(new NormalProvider());
        mProviderDelegate.registerProvider(new NormalOtherProvider());
    }
}

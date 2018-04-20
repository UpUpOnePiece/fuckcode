package me.danwi.recyclerviewadvance.viewholder;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.annotation.ItemProviderTag;
import com.chad.library.adapter.base.provider.BaseItemProvider;

import me.danwi.recyclerviewadvance.R;
import me.danwi.recyclerviewadvance.entity.ItemModel;

/**
 * Created with Android Studio.
 * User: HandSome-T
 * Date: 18/4/20
 * Time: 下午11:33
 */
@ItemProviderTag(viewType = 0, layout = R.layout.item_novel)
public class NormalProvider extends BaseItemProvider<ItemModel, BaseViewHolder> {

    @Override
    public void convert(BaseViewHolder helper, ItemModel data, int position) {
        helper.setText(R.id.tv_novel, data.novel.novelName);
    }

    @Override
    public void onClick(BaseViewHolder helper, ItemModel data, int position) {

    }

    @Override
    public boolean onLongClick(BaseViewHolder helper, ItemModel data, int position) {
        return false;
    }

}

package com.example.gigaw.gemmountainapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by gigaw on 6/24/2017.
 */

public class GemListFragment extends Fragment {
    private RecyclerView mGemRecyclerView;
    private GemAdapter mAdapter;

    public GemListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gem_list, container, false);

        mGemRecyclerView = (RecyclerView) view.findViewById(R.id.gem_recycler_view);
        mGemRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    private void updateUI() {
        GemBucket gemBucket = GemBucket.get(getActivity());
        List<Gems> gems = gemBucket.getGems();

        mAdapter = new GemAdapter(gems);
        mGemRecyclerView.setAdapter(mAdapter);
    }

    private class GemHolder extends RecyclerView.ViewHolder {
        public GemHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_gem, parent, false));
        }
    }

    private class GemAdapter extends RecyclerView.Adapter<GemHolder> {
        private List<Gems> mGems;

        public GemAdapter(List<Gems> gems) {
            mGems = gems;
        }

        @Override
        public GemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());

            return new GemHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(GemHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return mGems.size();
        }
    }
}

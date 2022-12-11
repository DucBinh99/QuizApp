package com.example.final_quiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.final_quiz.databinding.FragmentHomeBinding;
import com.example.final_quiz.my_interface.IClickUserListener;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    UserAdapter userAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        binding.homeRcv.setLayoutManager(new LinearLayoutManager(getContext()));
        userAdapter = new UserAdapter(getUsers(), new IClickUserListener() {
            @Override
            public void onClickUser(User user) {
                toLevelFragment(user);
            }
        });
        binding.homeRcv.setAdapter(userAdapter);
        return binding.getRoot();
    }

    private ArrayList<User> getUsers() {
        ArrayList<User> cards = new ArrayList<>();
        cards.add(new User(R.drawable.diali1, "Địa lí"));
        cards.add(new User(R.drawable.vatli1, "Toán"));
        cards.add(new User(R.drawable.lichsu, "Lịch sử"));
        cards.add(new User(R.drawable.nghethuat, "Nghệ thuật"));
        cards.add(new User(R.drawable.thethao, "Thể thao"));
        cards.add(new User(R.drawable.sinhhoc, "Sinh học"));
        return cards;
    }

    private void toLevelFragment(User user) {
        Data send_data = new Data(user.getName(), "","");
        HomeFragmentDirections.ActionHomeFragmentToLevelFragment actionHomeFragmentToLevelFragment = HomeFragmentDirections.actionHomeFragmentToLevelFragment(send_data);
        Navigation.findNavController(getActivity(),R.id.nav_host_fragment).navigate(actionHomeFragmentToLevelFragment);
    }
}

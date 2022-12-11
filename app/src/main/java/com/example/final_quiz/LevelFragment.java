package com.example.final_quiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.final_quiz.databinding.FragmentHomeBinding;
import com.example.final_quiz.databinding.FragmentLevelBinding;
import com.example.final_quiz.my_interface.IClickUserListener;

import java.util.ArrayList;

public class LevelFragment extends Fragment {

    FragmentLevelBinding binding;
    UserAdapter userAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(inflater, container, false);

        binding.levelRcv.setLayoutManager(new LinearLayoutManager(getContext()));
        userAdapter = new UserAdapter(getUsers(), new IClickUserListener() {
            @Override
            public void onClickUser(User user) {
                toAnswerFragment(user);
            }
        });
        binding.levelRcv.setAdapter(userAdapter);
        return binding.getRoot();
    }

    private ArrayList<User> getUsers() {
        ArrayList<User> cards = new ArrayList<>();
        cards.add(new User(R.drawable.greendot, "Dễ"));
        cards.add(new User(R.drawable.yellowdot, "Trung bình"));
        cards.add(new User(R.drawable.reddot, "Khó"));
        return cards;
    }

    private void toAnswerFragment(User user){
        Data receiveData = LevelFragmentArgs.fromBundle(getArguments()).getData();
        Data send_data = new Data(receiveData.getCategory(),user.getName(),"");
        LevelFragmentDirections.ActionLevelFragmentToAnswerFragment actionLevelFragmentToAnswerFragment = LevelFragmentDirections.actionLevelFragmentToAnswerFragment(send_data);
        Navigation.findNavController(getActivity(),R.id.nav_host_fragment).navigate(actionLevelFragmentToAnswerFragment);
    }
}
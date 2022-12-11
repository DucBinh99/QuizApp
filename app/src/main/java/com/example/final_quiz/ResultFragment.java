package com.example.final_quiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.final_quiz.databinding.FragmentResultBinding;


public class ResultFragment extends Fragment {
     FragmentResultBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentResultBinding.inflate(inflater, container, false);
        Data reveiverData = ResultFragmentArgs.fromBundle(getArguments()).getData();
        binding.score.setText(reveiverData.getScore());
        binding.Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_resultFragment_to_homeFragment);
            }
        });
        binding.Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sendContent = String.format("Bạn đã trả lời đúng %s câu hỏi mức độ %s trong chủ đề %s",reveiverData.getScore(), reveiverData.getLevel(), reveiverData.getCategory());
                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, sendContent);
                sendIntent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}
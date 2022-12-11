package com.example.final_quiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.final_quiz.databinding.FragmentAnswerBinding;
import com.example.final_quiz.databinding.FragmentLevelBinding;
import com.example.final_quiz.my_interface.IClickUserListener;

import java.util.ArrayList;
import java.util.Random;


public class AnswerFragment extends Fragment {


    FragmentAnswerBinding binding;
    UserAdapter userAdapter;

    private int index = randomIndex();
    private int questionnumber = 1;
    private int totalquestion = 5;
    private int score = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnswerBinding.inflate(inflater, container, false);

        chooseQuestion();
        binding.indexQuestion.setText("" + questionnumber);
        binding.answerRcv.setLayoutManager(new LinearLayoutManager(getContext()));
        userAdapter = new UserAdapter(getUsers(), new IClickUserListener() {
            @Override
            public void onClickUser(User user) {
                getAnswer(user);
                randomIndex();
                questionnumber++;
                sendData();
                chooseQuestion();
            }
        });
        binding.answerRcv.setAdapter(userAdapter);
        return binding.getRoot();
    }

    private ArrayList<User> getUsers() {
        ArrayList<User> cards = new ArrayList<>();
        cards.add(new User(R.drawable.tick, "Đúng"));
        cards.add(new User(R.drawable.xtick, "Sai"));
        return cards;
    }

    private void chooseQuestion() {
        Data receiverData = LevelFragmentArgs.fromBundle(getArguments()).getData();
        if (receiverData.getCategory() == "Toán" && receiverData.getLevel() == "Khó") {
            binding.Question.setText(Question.getMathHardQuestion(index));
        } else if (receiverData.getCategory() == "Toán" && receiverData.getLevel() == "Trung bình") {
            binding.Question.setText(Question.getMathMediumQuestion(index));
        } else if (receiverData.getCategory() == "Toán" && receiverData.getLevel() == "Dễ") {
            binding.Question.setText(Question.getMathEasyQuestion(index));
        } else if (receiverData.getCategory() == "Nghệ thuật" && receiverData.getLevel() == "Khó") {
            binding.Question.setText(Question.getArtHardQuestion(index));
        } else if (receiverData.getCategory() == "Nghệ thuật" && receiverData.getLevel() == "Trung bình") {
            binding.Question.setText(Question.getArtMediumQuestion(index));
        } else if (receiverData.getCategory() == "Nghệ thuật" && receiverData.getLevel() == "Dễ") {
            binding.Question.setText(Question.getArtEasyQuestion(index));
        } else if (receiverData.getCategory() == "Địa lí" && receiverData.getLevel() == "Khó") {
            binding.Question.setText(Question.getGeoHardQuestion(index));
        } else if (receiverData.getCategory() == "Địa lí" && receiverData.getLevel() == "Trung bình") {
            binding.Question.setText(Question.getGeoMediumQuestion(index));
        } else if (receiverData.getCategory() == "Địa lí" && receiverData.getLevel() == "Dễ") {
            binding.Question.setText(Question.getGeoEasyQuestion(index));
        } else if (receiverData.getCategory() == "Lịch sử" && receiverData.getLevel() == "Khó") {
            binding.Question.setText(Question.getHisHardQuestion(index));
        } else if (receiverData.getCategory() == "Lịch sử" && receiverData.getLevel() == "Trung bình") {
            binding.Question.setText(Question.getHisMediumQuestion(index));
        } else if (receiverData.getCategory() == "Lịch sử" && receiverData.getLevel() == "Dễ") {
            binding.Question.setText(Question.getHisEasyQuestion(index));
        } else if (receiverData.getCategory() == "Thể thao" && receiverData.getLevel() == "Khó") {
            binding.Question.setText(Question.getSportHardQuestion(index));
        } else if (receiverData.getCategory() == "Thể thao" && receiverData.getLevel() == "Trung bình") {
            binding.Question.setText(Question.getSportMediumQuestion(index));
        } else if (receiverData.getCategory() == "Thể thao" && receiverData.getLevel() == "Dễ") {
            binding.Question.setText(Question.getSportEasyQuestion(index));
        } else if (receiverData.getCategory() == "Sinh học" && receiverData.getLevel() == "Khó") {
            binding.Question.setText(Question.getBioHardQuestion(index));
        } else if (receiverData.getCategory() == "Sinh học" && receiverData.getLevel() == "Trung bình") {
            binding.Question.setText(Question.getBioMediumQuestion(index));
        } else if (receiverData.getCategory() == "Sinh học" && receiverData.getLevel() == "Dễ") {
            binding.Question.setText(Question.getBioEasyQuestion(index));

        }
    }
    private void getAnswer(User user) {
        Data receiverData = LevelFragmentArgs.fromBundle(getArguments()).getData();
        if (receiverData.getCategory() == "Toán" && receiverData.getLevel() == "Khó") {
            if (Question.getMathHardAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Toán" && receiverData.getLevel() == "Trung bình") {
            if (Question.getMathMediumAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Toán" && receiverData.getLevel() == "Dễ") {
            if (Question.getMathEasyAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Nghệ thuật" && receiverData.getLevel() == "Khó") {
            if (Question.getArtHardAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Nghệ thuật" && receiverData.getLevel() == "Trung bình") {
            if (Question.getArtMediumAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Nghệ thuật" && receiverData.getLevel() == "Dễ") {
            if (Question.getArtEasyAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Địa lí" && receiverData.getLevel() == "Khó") {
            if (Question.getGeoHardAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Địa lí" && receiverData.getLevel() == "Trung bình") {
            if (Question.getGeoMediumAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Địa lí" && receiverData.getLevel() == "Dễ") {
            if (Question.getGeoEasyAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Lịch sử" && receiverData.getLevel() == "Khó") {
            if (Question.getHisHardAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Lịch sử" && receiverData.getLevel() == "Trung bình") {
            if (Question.getHisMediumAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Lịch sử" && receiverData.getLevel() == "Dễ") {
            if (Question.getHisEasyAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Thể thao" && receiverData.getLevel() == "Khó") {
            if (Question.getSportHardAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Thể thao" && receiverData.getLevel() == "Trung bình") {
            if (Question.getSportMediumAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Thể thao" && receiverData.getLevel() == "Dễ") {
            if (Question.getSportEasyAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Sinh học" && receiverData.getLevel() == "Khó") {
            if (Question.getBioHardAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Sinh học" && receiverData.getLevel() == "Trung bình") {
            if (Question.getBioMediumAnswer(index) == user.getName()) {
                score++;
            }
        } else if (receiverData.getCategory() == "Sinh học" && receiverData.getLevel() == "Dễ") {
            if (Question.getBioEasyAnswer(index) == user.getName()) {
                score++;
            }
        }
    }
        private void sendData () {
            Data receiverData = LevelFragmentArgs.fromBundle(getArguments()).getData();
            if (questionnumber - 1 == totalquestion) {
                Data send_data = new Data(receiverData.getCategory(), receiverData.getLevel(), "" + score);
                AnswerFragmentDirections.ActionAnswerFragmentToResultFragment actionAnswerQuestionFragmentToResultFragment = AnswerFragmentDirections.actionAnswerFragmentToResultFragment(send_data);
                Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(actionAnswerQuestionFragmentToResultFragment);
                score = 0;

            } else {
                binding.indexQuestion.setText("" + questionnumber);
            }
        }

        private int randomIndex () {
            Random random = new Random();
            int[] a = new int[5];
            int tmp = 0;

            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(10);
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        i--;
                        break;
                    }
                }
                tmp = i;
            }
            index = a[tmp];
            return index;
        }
    }



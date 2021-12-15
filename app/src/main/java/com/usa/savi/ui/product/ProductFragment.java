package com.usa.savi.ui.product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.snackbar.Snackbar;
import com.usa.savi.R;
import com.usa.savi.databinding.ActivityMainBinding;
import com.usa.savi.databinding.FragmentProductBinding;

public class ProductFragment extends Fragment {

    private ProductViewModel galleryViewModel;
    private FragmentProductBinding binding;
    private ImageView iv1;
    private Button btnAddCart, btnAddCart2, btnAddCart3, btnAddCart4,btnAddCart5;
    private LinearLayout linearLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        galleryViewModel =
                new ViewModelProvider(this).get(ProductViewModel.class);

        binding = FragmentProductBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        iv1 = (ImageView) binding.imgProduct1;

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"app en construccion",Toast.LENGTH_SHORT).show();
            }
        });

        return root;



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
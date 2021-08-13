package com.e.a10118317_uas_wisatabandungraya;
// Jumat, 13 Agustus 2021, 10118317, Muhammad Fikri Juan R, IF8
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.e.a10118317_uas_wisatabandungraya.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Bandung and move the camera
        LatLng rancaupas = new LatLng(	-7.141151, 	107.395696);
        mMap.addMarker(new MarkerOptions().position(rancaupas).title("RANCA UPAS Camping Ground"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rancaupas));

        LatLng farmhouse = new LatLng(	-6.833053, 	107.605398);
        mMap.addMarker(new MarkerOptions().position(farmhouse).title("Farm house lembang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(farmhouse));

        LatLng dusunbambu = new LatLng(	-6.789453, 	107.578795);
        mMap.addMarker(new MarkerOptions().position(dusunbambu).title("Dusun Bambu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dusunbambu));

        LatLng orchid = new LatLng(	-6.780493, 	107.637400);
        mMap.addMarker(new MarkerOptions().position(orchid).title("Orchid Forest Cikole"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(orchid));

        LatLng tangkubanperahu = new LatLng(	-6.759686, 	107.610012);
        mMap.addMarker(new MarkerOptions().position(tangkubanperahu).title("Gn. Tangkuban Parahu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tangkubanperahu));

        LatLng grafikacikole = new LatLng(	-6.785010, 	107.651471);
        mMap.addMarker(new MarkerOptions().position(grafikacikole).title("Grafika Cikole"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(grafikacikole));

        LatLng deranch = new LatLng(	-6.815192, 	107.626738);
        mMap.addMarker(new MarkerOptions().position(deranch).title("De' Ranch Maribaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(deranch));

        LatLng curugcimahi = new LatLng(	-6.797796, 	107.578262);
        mMap.addMarker(new MarkerOptions().position(curugcimahi).title("Curug Cimahi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curugcimahi));

        LatLng kawahputih = new LatLng(	-7.166239, 	107.402193);
        mMap.addMarker(new MarkerOptions().position(kawahputih).title("Kawah Putih"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kawahputih));

        LatLng thelodge = new LatLng(	-6.829446, 	107.687477);
        mMap.addMarker(new MarkerOptions().position(thelodge).title("The Lodge Maribaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(thelodge));

        LatLng curugmalela = new LatLng(	-7.018345, 	107.207119);
        mMap.addMarker(new MarkerOptions().position(curugmalela).title("Curug Male107.636640la"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curugmalela));

        LatLng puncakbintang = new LatLng(	-6.841315, 	107.677411);
        mMap.addMarker(new MarkerOptions().position(puncakbintang).title("Puncak Bintang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(puncakbintang));

        LatLng tsb = new LatLng(	-6.925765, 	107.636640);
        mMap.addMarker(new MarkerOptions().position(tsb).title("Trans Studio Bandung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tsb));

        LatLng hutanpr = new LatLng(	-7.180714, 	107.547012);
        mMap.addMarker(new MarkerOptions().position(hutanpr).title("Hutan Pinus Rahong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hutanpr));

        LatLng tebingkeraton = new LatLng(	-6.834196, 	107.663604);
        mMap.addMarker(new MarkerOptions().position(tebingkeraton).title("Tebing Keraton"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tebingkeraton));

        LatLng bandung = new LatLng(	-6.905977, 	107.613144);
        mMap.addMarker(new MarkerOptions().position(bandung).title("Bandung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bandung, 10f));


    }
}
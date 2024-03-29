package com.example.mrquentin.drawertest.BluetoothActivity;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.nio.charset.Charset;
import java.util.UUID;

/**
 * Created by leo on 29/01/17.
 */

public class MessageActivity extends AppCompatActivity {

//    private static final String TAG = MessageActivity.class.getSimpleName();
//    private TextView dialogue;
//    private EditText input;
//
//    public static UUID UART_UUID   = UUID.fromString("6e400001-b5a3-f393-e0a9-e50e24dcca9e");
//    public static UUID TX_UUID     = UUID.fromString("6e400002-b5a3-f393-e0a9-e50e24dcca9e");
//    public static UUID RX_UUID     = UUID.fromString("6e400003-b5a3-f393-e0a9-e50e24dcca9e");
//    public static UUID CLIENT_UUID;// = UUID.fromString("00001530-1212-EFDE-1523-785FEABCD123");
//
//    private BluetoothGattCharacteristic tx;
//    private BluetoothGattCharacteristic rx;
//
//    private BluetoothGatt mGatt;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_message);
//        dialogue = (TextView) findViewById(R.id.messages);
//        input = (EditText) findViewById(R.id.input);
//
//        Bundle bundle = getIntent().getExtras();
//        if (bundle != null) {
//            Device device = bundle.getParcelable("connectedDevice");
//            mGatt = device.getDevice().connectGatt(getApplicationContext(), false, mGattCallback);
//            Toast.makeText(getApplicationContext(), "Successfully connected " + device.getDeviceAddress().toString(), Toast.LENGTH_LONG).show();
//
////             if (device.getUUIDs().contains(UART_UUID)) {
////                    mGatt = device.getDevice().connectGatt(getApplicationContext(), false, mGattCallback);
////                    //Toast.makeText(getApplicationContext(), "Successfully connected " + device.getDeviceAddress().toString(), Toast.LENGTH_LONG).show();
////
////            }
//        }
//
//    }
//
//    public void sendClick(View view) {
//        String message = input.getText().toString();
//        Log.d(TAG, message);
//        input.setText("");
//        tx.setValue(message.getBytes(Charset.forName("UTF-8")));
//        if (mGatt.writeCharacteristic(tx)) {
//            dialogue.append("Sent: " + message + "\n");
//        }
//    }
//
//    // Gatt callback
//    public BluetoothGattCallback mGattCallback = new BluetoothGattCallback() {
//        // Called whenever the device connection state changes, i.e. from disconnected to connected.
//        @Override
//        public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
//            Log.d(TAG, "new BluetoothGattCallback");
//            super.onConnectionStateChange(gatt, status, newState);
//            if (newState == BluetoothGatt.STATE_CONNECTED) {
//                //Toast.makeText(getApplicationContext(), "Connected!", Toast.LENGTH_LONG).show();
//                Log.d(TAG, "connected");
//                // Discover services.
//                if (!gatt.discoverServices()) {
//                    //Toast.makeText(getApplicationContext(), "Failed to start discovering services!", Toast.LENGTH_LONG).show();
//                    Log.d(TAG, "Failed to start discovering services!");
//                }
//            }
//            else if (newState == BluetoothGatt.STATE_DISCONNECTED) {
//                //Toast.makeText(getApplicationContext(), "Disconnected!", Toast.LENGTH_LONG).show();
//                Log.d(TAG, "Disconnected!");
//            }
//            else {
//                //Toast.makeText(getApplicationContext(), "Connection state changed.  New state: ", Toast.LENGTH_LONG).show();
//                Log.d(TAG, "Connection state changed.  New state: " + newState);
//            }
//        }
//
//        // Called when services have been discovered on the remote device.
//        // It seems to be necessary to wait for this discovery to occur before
//        // manipulating any services or characteristics.
//        @Override
//        public void onServicesDiscovered(BluetoothGatt gatt, int status) {
//            Log.d(TAG, "onServicesDiscovered()");
//            super.onServicesDiscovered(gatt, status);
//            if (status == BluetoothGatt.GATT_SUCCESS) {
//                Log.d(TAG, "Service discovery completed!");
//            }
//            else {
//                Log.d(TAG, "Service discovery failed with status: " + status);
//            }
//            // Save reference to each characteristic.
//            tx = gatt.getService(UART_UUID).getCharacteristic(TX_UUID);
//            rx = gatt.getService(UART_UUID).getCharacteristic(RX_UUID);
//            // Setup notifications on RX characteristic changes (i.e. data received).
//            // First call setCharacteristicNotification to enable notification.
//            if (!gatt.setCharacteristicNotification(rx, true)) {
//                Log.d(TAG, "Couldn't set notifications for RX characteristic!");
//            }
//            // Next update the RX characteristic's client descriptor to enable notifications.
//            if (rx.getDescriptor(CLIENT_UUID) != null) {
//                BluetoothGattDescriptor desc = rx.getDescriptor(CLIENT_UUID);
//                desc.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
//                if (!gatt.writeDescriptor(desc)) {
//                    Log.d(TAG, "Couldn't write RX client descriptor value!");
//                }
//            }
//            else {
//                Log.d(TAG, "Couldn't get RX client descriptor!");
//            }
//        }
//
//        // Called when a remote characteristic changes (like the RX characteristic).
//        @Override
//        public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
//            super.onCharacteristicChanged(gatt, characteristic);
//            dialogue.append("Received: " + characteristic.getStringValue(0) + "\n");
//        }
//    };


}

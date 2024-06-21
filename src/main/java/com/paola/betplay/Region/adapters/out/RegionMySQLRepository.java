package com.paola.betplay.Region.adapters.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.paola.betplay.Region.domain.models.Region;
import com.paola.betplay.Region.infrastructure.RegionRepository;

public class RegionMySQLRepository implements RegionRepository {
    private final String url;
    private final String user;
    private final String password;

    public RegionMySQLRepository(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void save(Region region) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO region (name_region, id_country) VALUES (?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, region.getNameRegion());
                statement.setInt(2, region.getIdCountry());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Region region) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "UPDATE region SET name_region = ? WHERE id_region = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, region.getNameRegion());
                statement.setInt(2, region.getIdRegion());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Region> findById(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM region WHERE id_region = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        Region region = new Region(
                            resultSet.getInt("id_region"),
                            resultSet.getString("name_region"),
                            resultSet.getInt("id_country")
                        );
                        return Optional.of(region);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void delete(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM region WHERE id_region = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Region> findAll() {
        List<Region> regions = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM region";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Region region = new Region(
                        resultSet.getInt("id_region"),
                        resultSet.getString("name_region"),
                        resultSet.getInt("id_country")
                    );
                    regions.add(region);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return regions;
    }
}
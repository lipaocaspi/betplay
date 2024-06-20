package com.paola.betplay.Match.adapters.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.paola.betplay.Match.domain.models.Match;
import com.paola.betplay.Match.infrastructure.MatchRepository;

public class MatchMySQLRepository implements MatchRepository {
    private final String url;
    private final String user;
    private final String password;

    public MatchMySQLRepository(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void save(Match match) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO match (date_match) VALUES (?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, match.getDateMatch());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Match match) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "UPDATE match SET date_match = ? WHERE id_match = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, match.getDateMatch());
                statement.setInt(2, match.getIdMatch());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Match> findById(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM match WHERE id_match = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        Match match = new Match(
                            resultSet.getInt("id_match"),
                            resultSet.getString("date_match")
                        );
                        return Optional.of(match);
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
            String query = "DELETE FROM match WHERE id_match = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Match> findAll() {
        List<Match> matches = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM match";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Match match = new Match(
                        resultSet.getInt("id_match"),
                        resultSet.getString("date_match")
                    );
                    matches.add(match);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matches;
    }
}
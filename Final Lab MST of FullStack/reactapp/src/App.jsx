import React from 'react';
import ActivityCard from './ActivityCard';
import './App.css';

function App() {
  const activities = [
    {
      id: 1,
      title: 'Morning Jog',
      date: '2023-10-25',
      category: 'Fitness',
    },
    {
      id: 2,
      title: 'React Study Session',
      date: '2023-10-26',
      category: 'Education',
    },
    {
      id: 3,
      title: 'Grocery Shopping',
      date: '2023-10-27',
      category: 'Errands',
    },
    {
      id: 4,
      title: 'Movie Night',
      date: '2023-10-28',
      category: 'Entertainment',
    },
  ];

  return (
    <div className="app-container">
      <h1>My Activities</h1>
      <div className="activity-list">
        {activities.map((activity) => (
          <ActivityCard
            key={activity.id}
            title={activity.title}
            date={activity.date}
            category={activity.category}
          />
        ))}
      </div>
    </div>
  );
}

export default App;

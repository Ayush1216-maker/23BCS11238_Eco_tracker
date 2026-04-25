import React from 'react';
import './ActivityCard.css';

const ActivityCard = ({ title, date, category }) => {
  return (
    <div className="activity-card">
      <h3 className="activity-title">{title}</h3>
      <p className="activity-date">Date: {date}</p>
      <span className="activity-category">{category}</span>
    </div>
  );
};

export default ActivityCard;
